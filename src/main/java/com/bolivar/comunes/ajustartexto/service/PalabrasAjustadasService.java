package com.bolivar.comunes.ajustartexto.service;

import com.bolivar.comunes.casing.consumingwebservice.wsdl.*;
import com.bolivar.comunes.ajustartexto.models.PalabraajustadaResponse;
import org.springframework.context.annotation.Primary;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Primary
public class PalabrasAjustadasService extends WebServiceGatewaySupport {

    private static final String ENDPOINT = "https://www.dataaccess.com/webservicesserver/TextCasing.wso?wsdl";
    private final ObjectFactory of = new ObjectFactory();

    public PalabraajustadaResponse ajustarTextoPrimeraPalabraMayusculaDemasMinuscula(String palabra, String token) {

        PalabraajustadaResponse resultado = new PalabraajustadaResponse();
        TitleCaseWordsWithToken texto = of.createTitleCaseWordsWithToken();
        texto.setSText(palabra);
        texto.setSToken(token);

        TitleCaseWordsWithTokenResponse respuesta = (TitleCaseWordsWithTokenResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getTitleCaseWordsWithTokenResult());

        return resultado;
    }

    public PalabraajustadaResponse intercalarMayusculasMinusculas(String palabra) {

        PalabraajustadaResponse resultado = new PalabraajustadaResponse();
        InvertStringCase texto = of.createInvertStringCase();
        texto.setSAString(palabra);

        InvertStringCaseResponse respuesta = (InvertStringCaseResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getInvertStringCaseResult());

        return resultado;
    }

    public PalabraajustadaResponse cambiarPrimeraLetraDemasDiferenteAPrimeraLetra(String palabra) {

        PalabraajustadaResponse resultado = new PalabraajustadaResponse();
        InvertCaseFirstAdjustStringToPrevious texto = of.createInvertCaseFirstAdjustStringToPrevious();
        texto.setSAString(palabra);

        InvertCaseFirstAdjustStringToPreviousResponse respuesta = (InvertCaseFirstAdjustStringToPreviousResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getInvertCaseFirstAdjustStringToPreviousResult());

        return resultado;
    }

    public PalabraajustadaResponse cambiarPrimeraLetraDemasIgualAPrimeraLetra(String palabra) {

        PalabraajustadaResponse resultado = new PalabraajustadaResponse();
        InvertCaseFirstAdjustStringToCurrent texto = of.createInvertCaseFirstAdjustStringToCurrent();
        texto.setSAString(palabra);

        InvertCaseFirstAdjustStringToCurrentResponse respuesta = (InvertCaseFirstAdjustStringToCurrentResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getInvertCaseFirstAdjustStringToCurrentResult());

        return resultado;
    }

    public PalabraajustadaResponse cambiarTodoMayusculasTokenEntreLetras(String palabra, String token) {

        PalabraajustadaResponse resultado = new PalabraajustadaResponse();
        AllUppercaseWithToken texto = of.createAllUppercaseWithToken();
        texto.setSAString(palabra);
        texto.setSToken(token);

        AllUppercaseWithTokenResponse respuesta = (AllUppercaseWithTokenResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getAllUppercaseWithTokenResult());

        return resultado;
    }

    public PalabraajustadaResponse cambiarTodoMinusculasTokenEntreLetras(String palabra, String token) {

        PalabraajustadaResponse resultado = new PalabraajustadaResponse();
        AllLowercaseWithToken texto = of.createAllLowercaseWithToken();
        texto.setSAString(palabra);
        texto.setSToken(token);

        AllLowercaseWithTokenResponse respuesta = (AllLowercaseWithTokenResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getAllLowercaseWithTokenResult());

        return resultado;
    }

    public PalabraajustadaResponse cambiarTodoMayusculasTokenEntrePalabras(String palabra, String token) {

        PalabraajustadaResponse resultado = new PalabraajustadaResponse();
        UppercaseWordsWithToken texto = of.createUppercaseWordsWithToken();
        texto.setSAString(palabra);
        texto.setSToken(token);

        UppercaseWordsWithTokenResponse respuesta = (UppercaseWordsWithTokenResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getUppercaseWordsWithTokenResult());

        return resultado;
    }

    public PalabraajustadaResponse cambiarTodoMinusculasTokenEntrePalabras(String palabra, String token) {

        PalabraajustadaResponse resultado = new PalabraajustadaResponse();
        LowercaseWordsWithToken texto = of.createLowercaseWordsWithToken();
        texto.setSAString(palabra);
        texto.setSToken(token);

        LowercaseWordsWithTokenResponse respuesta = (LowercaseWordsWithTokenResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getLowercaseWordsWithTokenResult());

        return resultado;
    }

}
