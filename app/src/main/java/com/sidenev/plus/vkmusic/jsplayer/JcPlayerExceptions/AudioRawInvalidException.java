package com.sidenev.plus.vkmusic.jsplayer.JcPlayerExceptions;


public class AudioRawInvalidException extends Exception {
    public AudioRawInvalidException(String rawId) {
        super("Not a valid raw file id: " + rawId);
    }
}
