package com.workintech.s18d2.exceptions;

import java.time.LocalDateTime;

public class PlantErrorResponse {
    private Integer status;
    private String message;
    private LocalDateTime localDateTime;

    public PlantErrorResponse(Integer status, String message, LocalDateTime localDateTime) {
        this.status = status;
        this.message = message;
        this.localDateTime = localDateTime;
    }

    // Getter ve Setter metodları
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
