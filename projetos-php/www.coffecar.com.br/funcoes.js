function validaform(nomeform) {
	if (nomeform.cf_name.value == "") {
		alert("Nome não foi preenchido");
		return false;
	}
	if (nomeform.cf_message.value == "") {
		alert("Mensagem não foi preenchida");
		return false;
	}
	if (nomeform.cf_email.value.indexOf('@', 0) == -1) {
		alert("E-mail incorreto");
		return false;
	}

	return true;

}

function formata_campo(campo_passado, mascara) {
	var campo = campo_passado.value.length;
	var saida = mascara.substring(0, 1);
	var texto = mascara.substring(campo);
	if (texto.substring(0, 1) != saida) {
		campo_passado.value += texto.substring(0, 1);
	}
}

function valnumeros(e) {
	navegador = /msi/i.test(navigator.userAgent);
	if (navegador)
		var tecla = event.keyCode;
	else
		var tecla = e.which;
	if (tecla > 47 && tecla < 58)
		return true;
	else {
		if (tecla != 8)
			return false;
		else
			return true;
	}
}