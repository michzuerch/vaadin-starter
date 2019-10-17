package com.gmail.michzuerch.app.security;

import com.gmail.michzuerch.backend.data.entity.User;

@FunctionalInterface
public interface CurrentUser {

	User getUser();
}
