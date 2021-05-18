package com.bolivar.comunes.casing.service;

import com.bolivar.comunes.casing.consumingwebservice.wsdl.*;
import com.bolivar.comunes.casing.models.ObtenerpalabraajustadaResponse;
import org.springframework.context.annotation.Primary;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

@Primary
public class PalabrasAjustadasService extends WebServiceGatewaySupport {

    private static final String ENDPOINT = "https://www.dataaccess.com/webservicesserver/TextCasing.wso?wsdl";
    private final ObjectFactory of = new ObjectFactory();

    public ObtenerpalabraajustadaResponse ajustarTexto1MayusculaDemasMinuscula(String palabra, String token) {

        ObtenerpalabraajustadaResponse resultado = new ObtenerpalabraajustadaResponse();
        TitleCaseWordsWithToken texto = of.createTitleCaseWordsWithToken();
        texto.setSText(palabra);
        texto.setSToken(token);

        TitleCaseWordsWithTokenResponse respuesta = (TitleCaseWordsWithTokenResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getTitleCaseWordsWithTokenResult());

        return resultado;
    }

    public ObtenerpalabraajustadaResponse intercalarMayusculasMinusculas(String palabra) {

        ObtenerpalabraajustadaResponse resultado = new ObtenerpalabraajustadaResponse();
        InvertStringCase texto = of.createInvertStringCase();
        texto.setSAString(palabra);

        InvertStringCaseResponse respuesta = (InvertStringCaseResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getInvertStringCaseResult());

        return resultado;
    }

    public ObtenerpalabraajustadaResponse cambiarLetra1DemasDiferenteALetra1(String palabra) {

        ObtenerpalabraajustadaResponse resultado = new ObtenerpalabraajustadaResponse();
        InvertCaseFirstAdjustStringToPrevious texto = of.createInvertCaseFirstAdjustStringToPrevious();
        texto.setSAString(palabra);

        InvertCaseFirstAdjustStringToPreviousResponse respuesta = (InvertCaseFirstAdjustStringToPreviousResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getInvertCaseFirstAdjustStringToPreviousResult());

        return resultado;
    }

    public ObtenerpalabraajustadaResponse cambiarLetra1DemasIgualALetra1(String palabra) {

        ObtenerpalabraajustadaResponse resultado = new ObtenerpalabraajustadaResponse();
        InvertCaseFirstAdjustStringToCurrent texto = of.createInvertCaseFirstAdjustStringToCurrent();
        texto.setSAString(palabra);

        InvertCaseFirstAdjustStringToCurrentResponse respuesta = (InvertCaseFirstAdjustStringToCurrentResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getInvertCaseFirstAdjustStringToCurrentResult());

        return resultado;
    }

    public ObtenerpalabraajustadaResponse cambiarTodoMayusculasTokenEntreLetras(String palabra, String token) {

        ObtenerpalabraajustadaResponse resultado = new ObtenerpalabraajustadaResponse();
        AllUppercaseWithToken texto = of.createAllUppercaseWithToken();
        texto.setSAString(palabra);
        texto.setSToken(token);

        AllUppercaseWithTokenResponse respuesta = (AllUppercaseWithTokenResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getAllUppercaseWithTokenResult());

        return resultado;
    }

    public ObtenerpalabraajustadaResponse cambiarTodoMinusculasTokenEntreLetras(String palabra, String token) {

        ObtenerpalabraajustadaResponse resultado = new ObtenerpalabraajustadaResponse();
        AllLowercaseWithToken texto = of.createAllLowercaseWithToken();
        texto.setSAString(palabra);
        texto.setSToken(token);

        AllLowercaseWithTokenResponse respuesta = (AllLowercaseWithTokenResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getAllLowercaseWithTokenResult());

        return resultado;
    }

    public ObtenerpalabraajustadaResponse cambiarTodoMayusculasTokenEntrePalabras(String palabra, String token) {

        ObtenerpalabraajustadaResponse resultado = new ObtenerpalabraajustadaResponse();
        UppercaseWordsWithToken texto = of.createUppercaseWordsWithToken();
        texto.setSAString(palabra);
        texto.setSToken(token);

        UppercaseWordsWithTokenResponse respuesta = (UppercaseWordsWithTokenResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getUppercaseWordsWithTokenResult());

        return resultado;
    }

    public ObtenerpalabraajustadaResponse cambiarTodoMinusculasTokenEntrePalabras(String palabra, String token) {

        ObtenerpalabraajustadaResponse resultado = new ObtenerpalabraajustadaResponse();
        LowercaseWordsWithToken texto = of.createLowercaseWordsWithToken();
        texto.setSAString(palabra);
        texto.setSToken(token);

        LowercaseWordsWithTokenResponse respuesta = (LowercaseWordsWithTokenResponse) getWebServiceTemplate().marshalSendAndReceive(ENDPOINT, texto);

        resultado.setTextoResultado(respuesta.getLowercaseWordsWithTokenResult());

        return resultado;
    }

}
