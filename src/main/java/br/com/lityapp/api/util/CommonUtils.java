package br.com.lityapp.api.util;

import br.com.lityapp.api.security.CurrentUser;
import org.springframework.security.core.context.SecurityContextHolder;

public class CommonUtils {
    public static CurrentUser getCurrentUser() {
        try {
            return (CurrentUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        } catch (Exception ex) {
            return null;
        }
    }
}
