package xyz.kyngs.fakturoid.api.v3.model.subject;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;

public class Subject extends BaseSubject {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("unreliable")
    private Boolean unreliable;
    @JsonProperty("unreliable_checked_at")
    private ZonedDateTime unreliableCheckedAt;

    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("url")
    private String url;
    @JsonProperty("created_at")
    private ZonedDateTime createdAt;
    @JsonProperty("updated_at")
    private ZonedDateTime updatedAt;

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Boolean getUnreliable() {
        return unreliable;
    }

    public ZonedDateTime getUnreliableCheckedAt() {
        return unreliableCheckedAt;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getUrl() {
        return url;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }
}
