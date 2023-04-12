package com.kitaplik.libraryservice.exception;

public record ExceptionMessage(String timestamp,
                               int status,
                               String message,
                               String path, String url) {
}
