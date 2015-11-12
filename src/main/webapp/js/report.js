$(document).ready(
		function() {
			$('button').button(function(event) {
				event.preventDefault();
			});

			$('#reportType').selectmenu();

			$('#serviceType').selectmenu();

			$('#date').datepicker({
				dateFormat : 'yymmdd'
			});

			$('#consulta').click(
					function(evento) {
						var url = '/rest/report/service/'
								+ $('#reportType').val() + '/'
								+ $('#serviceType').val();
						if ($('#date').val() != '') {
							url += '/' + $('#date').val();
							if ($('#interval').val() != '') {
								url += '/' + $('#interval').val();
							}
						}
						$.get(url).done(function(data) {
							drawChart(data);
						}).fail(function(xhr, status, error) {
							alert(xhr.responseText);
						});
					});
		});

function drawChart(data) {
	$('#canvas-wrapper')
			.html('')
			.html(
					'<span class="chart-span"><canvas id="myChart" width="400" height="400"/></span><span id="chartLegend" class="chart-legend"/>');
	var ctx = $('#myChart').get(0).getContext('2d');

	var colors = getRgbaColors(data.series.length);
	var dataset = [];

	for (var i = 0; i < data.series.length; i++) {
		dataset.push({
			label : data.series[i].label,
			fillColor : colors[i],
			strokeColor : colors[i],
			highlightFill : colors[i],
			highlightStroke : colors[i],
			data : data.series[i].data
		});
	}

	var chartData = {
		labels : data.labels,
		datasets : dataset
	};

	var options = {
		animation : true,
		barValueSpacing : 5,
		barDatasetSpacing : 1,
		tooltipFillColor : "rgba(0,0,0,0.8)",
		multiTooltipTemplate : "<%= datasetLabel %> - <%= value %>"
	};

	var myNewChart = new Chart(ctx).Bar(chartData, options);
	$('#chartLegend').html('').html(myNewChart.generateLegend());
}

function getRgbaColors(quantity) {
	var colors = [];
	for (var i = 1; i <= quantity; i++) {
		colors.push(getRandomColor());
	}
	return colors;
}

function getRandomColor() {
    var letters = '0123456789ABCDEF'.split('');
    var color = '#';
    for (var i = 0; i < 6; i++ ) {
        color += letters[Math.floor(Math.random() * 16)];
    }
    return color;
}
