package br.com.lelecoder.forumdynamo.adapter.web;

import br.com.lelecoder.forumdynamo.adapter.web.dto.ErrorMessage;
import br.com.lelecoder.forumdynamo.core.exceptions.TopicoNaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(TopicoNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ResponseEntity<ErrorMessage> resourceNotFouncException(TopicoNaoEncontradoException ex) {
        ErrorMessage error = new ErrorMessage(ex.getMessage(), 404);
        return new ResponseEntity<ErrorMessage>(error, HttpStatus.NOT_FOUND);
    }
}
