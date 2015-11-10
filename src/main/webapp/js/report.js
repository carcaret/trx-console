$(document).ready(function() {
	$("button").button(function(event) {
		event.preventDefault();
	});

	$("#reportType").selectmenu();
	
	$("#serviceType").selectmenu();
	
	$('#consulta').click(function(evento) {
		$.get('/rest/report/service/' + $("#reportType").val() + "/" + $("#serviceType").val(), function(data) {
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