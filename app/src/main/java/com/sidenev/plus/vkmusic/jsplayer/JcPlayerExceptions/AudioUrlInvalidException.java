package com.sidenev.plus.vkmusic.jsplayer.JcPlayerExceptions;


public class AudioUrlInvalidException extends IllegalStateException {
    public AudioUrlInvalidException(String url) {
        super("The url does not appear valid: " + url);
    }
}