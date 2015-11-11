$(document).ready(function() {
	$('button').button(function(event) {
		event.preventDefault();
	});

	$('#reportType').selectmenu();
	
	$('#serviceType').selectmenu();
	
	$('#date').datepicker({ dateFormat: 'yymmdd' });
	
	$('#consulta').click(function(evento) {
		var url = '/rest/report/service/' + $('#reportType').val() + '/' + $('#serviceType').val();
		if($('#date').val() != ''){
			url += '/' + $('#date').val();
			if($('#interval').val() != ''){
				url += '/' + $('#interval').val();
			}
		}
		$.get(url)
			.done(function(data) {
				var charData = {
					labels : data.labels,
					series : data.series
				};
				var options = {
					width : 500,
					height : 400
				};
				new Chartist.Bar('.ct-chart', charData, options);
			})
			.fail(function(xhr, status, error) {
				alert(xhr.responseText);
			});
	});
});