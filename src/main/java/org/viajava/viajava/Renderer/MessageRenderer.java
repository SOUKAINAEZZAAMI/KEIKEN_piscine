package org.viajava.viajava.Renderer;

import org.viajava.viajava.Provider.MessageProvider;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}

