package xyz.kyngs.fakturoid.api.v3.model.subject;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

public class Subject extends BaseSubject {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("unreliable")
    private Boolean unreliable;
    @JsonProperty("unreliable_checked_at")
    private OffsetDateTime unreliableCheckedAt;

    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("url")
    private String url;
    @JsonProperty("created_at")
    private OffsetDateTime createdAt;
    @JsonProperty("updated_at")
    private OffsetDateTime updatedAt;

    public Integer getId() {
        return id;
    }

    public Integer getUserId() {
        return userId;
    }

    public Boolean getUnreliable() {
        return unreliable;
    }

    public OffsetDateTime getUnreliableCheckedAt() {
        return unreliableCheckedAt;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public String getUrl() {
        return url;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }
}
