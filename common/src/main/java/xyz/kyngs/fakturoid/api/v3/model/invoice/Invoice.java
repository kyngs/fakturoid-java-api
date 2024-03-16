package xyz.kyngs.fakturoid.api.v3.model.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZonedDateTime;

public class Invoice extends BaseInvoice<Invoice.InvoiceLine> {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("your_name")
    private String yourName;
    @JsonProperty("your_street")
    private String yourStreet;
    @JsonProperty("your_city")
    private String yourCity;
    @JsonProperty("your_zip")
    private String yourZIP;
    @JsonProperty("your_country")
    private String yourCountry;
    @JsonProperty("your_registration_no")
    private String yourRegistrationNo;
    @JsonProperty("your_vat_no")
    private String yourVATNo;
    @JsonProperty("your_local_vat_no")
    private String yourLocalVATNo;

    @JsonProperty("generator_id")
    private Integer generatorId;

    @JsonProperty("token")
    private String token;
    @JsonProperty("status")
    private Status status;

    @JsonProperty("due_on")
    private LocalDate dueOn;
    @JsonProperty("sent_at")
    private ZonedDateTime sentAt;
    @JsonProperty("paid_on")
    private LocalDate paidOn;
    @JsonProperty("reminder_sent_at")
    private ZonedDateTime reminderSentAt;
    @JsonProperty("cancelled_at")
    private ZonedDateTime cancelledAt;
    @JsonProperty("uncollectible_at")
    private ZonedDateTime uncollectibleAt;
    @JsonProperty("locked_at")
    private ZonedDateTime lockedAt;
    @JsonProperty("webinvoice_seen_on")
    private LocalDate webInvoiceSeenOn;

    @JsonProperty("subtotal")
    private Double subtotal;
    @JsonProperty("total")
    private Double total;
    @JsonProperty("native_subtotal")
    private Double nativeSubtotal;
    @JsonProperty("native_total")
    private Double nativeTotal;
    @JsonProperty("remaining_amount")
    private Double remainingAmount;
    @JsonProperty("remaining_native_amount")
    private Double remainingNativeAmount;

    //EET not implemented
    @JsonProperty("vat_rates_summary")
    private VatRateSummary[] vatRatesSummary;
    @JsonProperty("paid_advances")
    private PaidAdvance[] paidAdvances;
    @JsonProperty("payments")
    private Payment[] payments;

    @JsonProperty("html_url")
    private String htmlURL;
    @JsonProperty("public_html_url")
    private String publicHTMLURL;
    @JsonProperty("url")
    private String url;
    @JsonProperty("pdf_url")
    private String pdfURL;
    @JsonProperty("subject_url")
    private String subjectURL;
    @JsonProperty("created_at")
    private ZonedDateTime createdAt;
    @JsonProperty("updated_at")
    private ZonedDateTime updatedAt;

    public Integer getId() {
        return id;
    }

    public String getYourName() {
        return yourName;
    }

    public String getYourStreet() {
        return yourStreet;
    }

    public String getYourCity() {
        return yourCity;
    }

    public String getYourZIP() {
        return yourZIP;
    }

    public String getYourCountry() {
        return yourCountry;
    }

    public String getYourRegistrationNo() {
        return yourRegistrationNo;
    }

    public String getYourVATNo() {
        return yourVATNo;
    }

    public String getYourLocalVATNo() {
        return yourLocalVATNo;
    }

    public Integer getGeneratorId() {
        return generatorId;
    }

    public String getToken() {
        return token;
    }

    public Status getStatus() {
        return status;
    }

    public LocalDate getDueOn() {
        return dueOn;
    }

    public ZonedDateTime getSentAt() {
        return sentAt;
    }

    public LocalDate getPaidOn() {
        return paidOn;
    }

    public ZonedDateTime getReminderSentAt() {
        return reminderSentAt;
    }

    public ZonedDateTime getCancelledAt() {
        return cancelledAt;
    }

    public ZonedDateTime getUncollectibleAt() {
        return uncollectibleAt;
    }

    public ZonedDateTime getLockedAt() {
        return lockedAt;
    }

    public LocalDate getWebInvoiceSeenOn() {
        return webInvoiceSeenOn;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public Double getTotal() {
        return total;
    }

    public Double getNativeSubtotal() {
        return nativeSubtotal;
    }

    public Double getNativeTotal() {
        return nativeTotal;
    }

    public Double getRemainingAmount() {
        return remainingAmount;
    }

    public Double getRemainingNativeAmount() {
        return remainingNativeAmount;
    }

    public VatRateSummary[] getVatRatesSummary() {
        return vatRatesSummary;
    }

    public PaidAdvance[] getPaidAdvances() {
        return paidAdvances;
    }

    public Payment[] getPayments() {
        return payments;
    }

    public String getHtmlURL() {
        return htmlURL;
    }

    public String getPublicHTMLURL() {
        return publicHTMLURL;
    }

    public String getUrl() {
        return url;
    }

    public String getPdfURL() {
        return pdfURL;
    }

    public String getSubjectURL() {
        return subjectURL;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public enum Status {
        @JsonProperty("open")
        OPEN,
        @JsonProperty("sent")
        SENT,
        @JsonProperty("overdue")
        OVERDUE,
        @JsonProperty("paid")
        PAID,
        @JsonProperty("cancelled")
        CANCELLED,
        @JsonProperty("uncollectible")
        UNCOLLECTIBLE
    }

    public static class PaidAdvance {
        @JsonProperty("id")
        private Integer id;
        @JsonProperty("number")
        private String number;
        @JsonProperty("variable_symbol")
        private String variableSymbol;
        @JsonProperty("paid_on")
        private LocalDate paidOn;
        @JsonProperty("vat_rate")
        private Double vatRate;
        @JsonProperty("price")
        private Double price;
        @JsonProperty("vat")
        private Double vat;
    }

    public static class VatRateSummary {
        @JsonProperty("vat_rate")
        private Integer vatRate;
        @JsonProperty("base")
        private Double base;
        @JsonProperty("vat")
        private Double vat;
        @JsonProperty("currency")
        private String currency;
        @JsonProperty("native_base")
        private Double nativeBase;
        @JsonProperty("native_vat")
        private Double nativeVAT;
        @JsonProperty("native_currency")
        private String nativeCurrency;

        public Integer getVatRate() {
            return vatRate;
        }

        public Double getBase() {
            return base;
        }

        public Double getVat() {
            return vat;
        }

        public String getCurrency() {
            return currency;
        }

        public Double getNativeBase() {
            return nativeBase;
        }

        public Double getNativeVAT() {
            return nativeVAT;
        }

        public String getNativeCurrency() {
            return nativeCurrency;
        }
    }

    public static class Payment extends BasePayment {
        @JsonProperty("id")
        private Integer id;
        @JsonProperty("currency")
        private String currency;

        @JsonProperty("tax_document_id")
        private Integer taxDocumentId;
        @JsonProperty("created_at")
        private ZonedDateTime createdAt;
        @JsonProperty("update_at")
        private ZonedDateTime updatedAt;

        public Integer getId() {
            return id;
        }

        public String getCurrency() {
            return currency;
        }

        public Integer getTaxDocumentId() {
            return taxDocumentId;
        }

        public ZonedDateTime getCreatedAt() {
            return createdAt;
        }

        public ZonedDateTime getUpdatedAt() {
            return updatedAt;
        }
    }

    public static class InvoiceLine extends BaseInvoiceLine {
        @JsonProperty("id")
        private Integer id;

        @JsonProperty("unit_price_without_vat")
        private Double unitPriceWithoutVAT;
        @JsonProperty("unit_price_with_vat")
        private Double unitPriceWithVAT;
        @JsonProperty("total_price_without_vat")
        private Double totalPriceWithoutVAT;
        @JsonProperty("total_vat")
        private Double totalVAT;
        @JsonProperty("native_total_price_without_vat")
        private Double nativeTotalPriceWithoutVAT;
        @JsonProperty("native_total_vat")
        private Double nativeTotalVAT;

        @JsonProperty("inventory")
        private InvoiceLineInventory inventory;

        public Integer getId() {
            return id;
        }

        public Double getUnitPriceWithoutVAT() {
            return unitPriceWithoutVAT;
        }

        public Double getUnitPriceWithVAT() {
            return unitPriceWithVAT;
        }

        public Double getTotalPriceWithoutVAT() {
            return totalPriceWithoutVAT;
        }

        public Double getTotalVAT() {
            return totalVAT;
        }

        public Double getNativeTotalPriceWithoutVAT() {
            return nativeTotalPriceWithoutVAT;
        }

        public Double getNativeTotalVAT() {
            return nativeTotalVAT;
        }

        public InvoiceLineInventory getInventory() {
            return inventory;
        }

        public static class InvoiceLineInventory {
            @JsonProperty("item_id")
            private Integer itemId;

            @JsonProperty("sku")
            private String sku;
            @JsonProperty("article_number_type")
            private String articleNumberType;
            @JsonProperty("article_number")
            private String articleNumber;
            @JsonProperty("move_id")
            private Integer moveId;

            public Integer getItemId() {
                return itemId;
            }

            public String getSKU() {
                return sku;
            }

            public String getArticleNumberType() {
                return articleNumberType;
            }

            public String getArticleNumber() {
                return articleNumber;
            }

            public Integer getMoveId() {
                return moveId;
            }
        }
    }

}
