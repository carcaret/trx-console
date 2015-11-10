$(document).ready(function() {
	$('#consulta').click(function(evento) {
		$.get('/rest/report/test', function(data) {
			alert(data.name);
		});
	});
});