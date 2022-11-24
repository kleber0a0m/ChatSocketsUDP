package br.edu.ifsuldeminas.sd.chat;

import chatinteface.Inicio;

public interface MessageContainer {

    String FROM = "::de::";

    void newMessage(String message);
}
