package org.viaannotations.viaannotations.Renderer;

import org.viaannotations.viaannotations.Provider.MessageProvider;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
