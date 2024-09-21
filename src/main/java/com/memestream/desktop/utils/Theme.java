package com.memestream.desktop.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@AllArgsConstructor
@Getter
public enum Theme {

    LIGHT(Objects.requireNonNull(Theme.class.getResource("/com/memestream/desktop/theme/light.css")).toExternalForm()),
    DARK(Objects.requireNonNull(Theme.class.getResource("/com/memestream/desktop/theme/dark.css")).toExternalForm());

    private final String path;

}
