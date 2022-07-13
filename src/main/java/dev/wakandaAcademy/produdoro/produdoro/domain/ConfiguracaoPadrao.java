package dev.wakandaAcademy.produdoro.produdoro.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
@Document(collation = "ConfiguracaoPadrao")
@Getter

public class ConfiguracaoPadrao {
	private static final String CODIGO_DEFAUIL = "Default";
	@Builder.Default
	@MongoId(targetType = FieldType.STRING)
	private String codigo = CODIGO_DEFAUIL;
	private Integer tempoMinutoFoco;
	private Integer tempoMinutoPausaCurta;	
	private Integer tempoMinutoPausaLonga;
	private Integer repeticoesParaPausaLonga;
	
}
