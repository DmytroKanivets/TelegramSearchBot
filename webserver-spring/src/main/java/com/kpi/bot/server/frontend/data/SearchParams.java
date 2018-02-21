package com.kpi.bot.server.frontend.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchParams {
    private String body;
    private String author;
    private String channel;
}
