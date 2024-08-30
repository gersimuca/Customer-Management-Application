package com.gersimuca.cma.feature.admin;

import java.util.Date;

public record AdminResponse(
    Long id,
    boolean removed,
    boolean enabled,
    String email,
    String name,
    String surname,
    String photo,
    Date created,
    AdminRole role) {}
