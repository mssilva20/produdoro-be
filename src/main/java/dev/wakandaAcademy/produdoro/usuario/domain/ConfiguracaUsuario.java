package dev.wakandaAcademy.produdoro.usuario.domain;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Builder(access = AccessLevel.PACKAGE)
@Getter

public class ConfiguracaUsuario {
	
	private String codigo = CODIGO_DEFAUIL;
	private Integer tempoMinutoFoco;
	private Integer tempoMinutoPausaCurta;	
	private Integer tempoMinutoPausaLonga;
	private Integer repeticoesParaPausaLonga;
	
}
