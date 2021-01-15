package com.sidenev.plus.vkmusic.jsplayer.JcPlayerExceptions;


public class AudioListNullPointerException extends NullPointerException {
    public AudioListNullPointerException() {
        super("The playlist is empty or null");
    }
}