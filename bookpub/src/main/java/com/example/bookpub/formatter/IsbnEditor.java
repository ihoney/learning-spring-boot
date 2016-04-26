package com.example.bookpub.formatter;

import org.springframework.util.StringUtils;

import java.beans.PropertyEditorSupport;
import java.util.Optional;

/**
 * Created by hongtao on 16/4/26.
 */
public class IsbnEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        if (StringUtils.hasText(text)) {
            setValue(new Isbn(text));
        } else {
            setValue(null);
        }
    }

    @Override
    public String getAsText() {
        Optional<Isbn> isbn = Optional.ofNullable((Isbn) getValue());
        if (isbn.isPresent()) {
            return isbn.get().getIsbn();
        } else {
            return "";
        }
    }
}
