$(document).ready(function() {
	$('#consulta').click(function(evento) {
		$.get('/rest/report/service', function(data) {
			var charData = {
				labels : data.labels,
				series : data.series
			};
			var options = {
				width : 500,
				height : 400
			};
			new Chartist.Bar('.ct-chart', charData, options);
		});
	});
});