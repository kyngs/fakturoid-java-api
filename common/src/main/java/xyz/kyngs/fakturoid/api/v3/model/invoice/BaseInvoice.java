package xyz.kyngs.fakturoid.api.v3.model.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class BaseInvoice<L extends BaseInvoice.BaseInvoiceLine> {

    @JsonProperty("custom_id")
    private String customId;
    @JsonProperty("document_type")
    private DocumentType documentType;
    @JsonProperty("proforma_followup_document")
    private ProformaFollowupDocument proformaFollowupDocument;

    @JsonProperty("tax_documents_ids")
    private Integer[] taxDocumentsIds;
    @JsonProperty("correction_id")
    private Integer correctionId;
    @JsonProperty("number")
    private String number;
    @JsonProperty("number_format_id")
    private Integer numberFormatId;
    @JsonProperty("variable_symbol")
    private String variableSymbol;

    @JsonProperty("client_name")
    private String clientName;
    @JsonProperty("client_street")
    private String clientStreet;
    @JsonProperty("client_city")
    private String clientCity;
    @JsonProperty("client_zip")
    private String clientZip;
    @JsonProperty("client_country")
    private String clientCountry;

    @JsonProperty("client_has_delivery_address")
    private boolean clientHasDeliveryAddress;
    @JsonProperty("client_delivery_name")
    private String clientDeliveryName;
    @JsonProperty("client_delivery_street")
    private String clientDeliveryStreet;
    @JsonProperty("client_delivery_city")
    private String clientDeliveryCity;
    @JsonProperty("client_delivery_zip")
    private String clientDeliveryZip;
    @JsonProperty("client_delivery_country")
    private String clientDeliveryCountry;

    @JsonProperty("client_registration_no")
    private String clientRegistrationNo;
    @JsonProperty("client_vat_no")
    private String clientVatNo;
    @JsonProperty("client_local_vat_no")
    private String clientLocalVatNo;

    @JsonProperty("subject_id")
    private Integer subjectId;
    @JsonProperty("subject_custom_id")
    private String subjectCustomId;

    @JsonProperty("related_id")
    private Integer relatedId;
    @JsonProperty("paypal")
    private Boolean paypal;
    @JsonProperty("gopay")
    private Boolean gopay;

    @JsonProperty("order_number")
    private String orderNumber;
    @JsonProperty("issued_on")
    private LocalDate issuedOn;
    @JsonProperty("taxable_fulfillment_due")
    private String taxableFulfillmentDue;
    @JsonProperty("due")
    private Integer due;

    @JsonProperty("note")
    private String note;
    @JsonProperty("footer_note")
    private String footerNote;
    @JsonProperty("private_note")
    private String privateNote;
    @JsonProperty("tags")
    private String[] tags;

    @JsonProperty("bank_account_id")
    private Integer bankAccountId;
    @JsonProperty("bank_account")
    private String bankAccount;
    @JsonProperty("iban")
    private String iban;
    @JsonProperty("swift_bic")
    private String swiftBic;
    @JsonProperty("iban_visibility")
    private String ibanVisibility;
    @JsonProperty("show_already_paid_note_in_pdf")
    private Boolean showAlreadyPaidNoteInPdf;
    @JsonProperty("payment_method")
    private PaymentMethod paymentMethod;
    @JsonProperty("custom_payment_method")
    private String customPaymentMethod;
    @JsonProperty("hide_bank_account")
    private Boolean hideBankAccount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("exchange_rate")
    private Double exchangeRate;
    @JsonProperty("language")
    private String language;
    @JsonProperty("transferred_tax_liability")
    private Boolean transferredTaxLiability;
    @JsonProperty("supply_code")
    private String supplyCode;
    @JsonProperty("oss")
    private String oss;
    @JsonProperty("vat_price_mode")
    private String vatPriceMode;
    @JsonProperty("lines")
    private L[] lines;
    @JsonProperty("attachments")
    private String[] attachments;

    public L[] getLines() {
        return lines;
    }

    public void setLines(L[] lines) {
        this.lines = lines;
    }

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public ProformaFollowupDocument getProformaFollowupDocument() {
        return proformaFollowupDocument;
    }

    public void setProformaFollowupDocument(ProformaFollowupDocument proformaFollowupDocument) {
        this.proformaFollowupDocument = proformaFollowupDocument;
    }

    public Integer[] getTaxDocumentsIds() {
        return taxDocumentsIds;
    }

    public void setTaxDocumentsIds(Integer[] taxDocumentsIds) {
        this.taxDocumentsIds = taxDocumentsIds;
    }

    public Integer getCorrectionId() {
        return correctionId;
    }

    public void setCorrectionId(Integer correctionId) {
        this.correctionId = correctionId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getNumberFormatId() {
        return numberFormatId;
    }

    public void setNumberFormatId(Integer numberFormatId) {
        this.numberFormatId = numberFormatId;
    }

    public String getVariableSymbol() {
        return variableSymbol;
    }

    public void setVariableSymbol(String variableSymbol) {
        this.variableSymbol = variableSymbol;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientStreet() {
        return clientStreet;
    }

    public void setClientStreet(String clientStreet) {
        this.clientStreet = clientStreet;
    }

    public String getClientCity() {
        return clientCity;
    }

    public void setClientCity(String clientCity) {
        this.clientCity = clientCity;
    }

    public String getClientZip() {
        return clientZip;
    }

    public void setClientZip(String clientZip) {
        this.clientZip = clientZip;
    }

    public String getClientCountry() {
        return clientCountry;
    }

    public void setClientCountry(String clientCountry) {
        this.clientCountry = clientCountry;
    }

    public boolean isClientHasDeliveryAddress() {
        return clientHasDeliveryAddress;
    }

    public void setClientHasDeliveryAddress(boolean clientHasDeliveryAddress) {
        this.clientHasDeliveryAddress = clientHasDeliveryAddress;
    }

    public String getClientDeliveryName() {
        return clientDeliveryName;
    }

    public void setClientDeliveryName(String clientDeliveryName) {
        this.clientDeliveryName = clientDeliveryName;
    }

    public String getClientDeliveryStreet() {
        return clientDeliveryStreet;
    }

    public void setClientDeliveryStreet(String clientDeliveryStreet) {
        this.clientDeliveryStreet = clientDeliveryStreet;
    }

    public String getClientDeliveryCity() {
        return clientDeliveryCity;
    }

    public void setClientDeliveryCity(String clientDeliveryCity) {
        this.clientDeliveryCity = clientDeliveryCity;
    }

    public String getClientDeliveryZip() {
        return clientDeliveryZip;
    }

    public void setClientDeliveryZip(String clientDeliveryZip) {
        this.clientDeliveryZip = clientDeliveryZip;
    }

    public String getClientDeliveryCountry() {
        return clientDeliveryCountry;
    }

    public void setClientDeliveryCountry(String clientDeliveryCountry) {
        this.clientDeliveryCountry = clientDeliveryCountry;
    }

    public String getClientRegistrationNo() {
        return clientRegistrationNo;
    }

    public void setClientRegistrationNo(String clientRegistrationNo) {
        this.clientRegistrationNo = clientRegistrationNo;
    }

    public String getClientVatNo() {
        return clientVatNo;
    }

    public void setClientVatNo(String clientVatNo) {
        this.clientVatNo = clientVatNo;
    }

    public String getClientLocalVatNo() {
        return clientLocalVatNo;
    }

    public void setClientLocalVatNo(String clientLocalVatNo) {
        this.clientLocalVatNo = clientLocalVatNo;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectCustomId() {
        return subjectCustomId;
    }

    public void setSubjectCustomId(String subjectCustomId) {
        this.subjectCustomId = subjectCustomId;
    }

    public Integer getRelatedId() {
        return relatedId;
    }

    public void setRelatedId(Integer relatedId) {
        this.relatedId = relatedId;
    }

    public Boolean getPaypal() {
        return paypal;
    }

    public void setPaypal(Boolean paypal) {
        this.paypal = paypal;
    }

    public Boolean getGopay() {
        return gopay;
    }

    public void setGopay(Boolean gopay) {
        this.gopay = gopay;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public LocalDate getIssuedOn() {
        return issuedOn;
    }

    public void setIssuedOn(LocalDate issuedOn) {
        this.issuedOn = issuedOn;
    }

    public String getTaxableFulfillmentDue() {
        return taxableFulfillmentDue;
    }

    public void setTaxableFulfillmentDue(String taxableFulfillmentDue) {
        this.taxableFulfillmentDue = taxableFulfillmentDue;
    }

    public Integer getDue() {
        return due;
    }

    public void setDue(Integer due) {
        this.due = due;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getFooterNote() {
        return footerNote;
    }

    public void setFooterNote(String footerNote) {
        this.footerNote = footerNote;
    }

    public String getPrivateNote() {
        return privateNote;
    }

    public void setPrivateNote(String privateNote) {
        this.privateNote = privateNote;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public Integer getBankAccountId() {
        return bankAccountId;
    }

    public void setBankAccountId(Integer bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getSwiftBic() {
        return swiftBic;
    }

    public void setSwiftBic(String swiftBic) {
        this.swiftBic = swiftBic;
    }

    public String getIbanVisibility() {
        return ibanVisibility;
    }

    public void setIbanVisibility(String ibanVisibility) {
        this.ibanVisibility = ibanVisibility;
    }

    public Boolean getShowAlreadyPaidNoteInPdf() {
        return showAlreadyPaidNoteInPdf;
    }

    public void setShowAlreadyPaidNoteInPdf(Boolean showAlreadyPaidNoteInPdf) {
        this.showAlreadyPaidNoteInPdf = showAlreadyPaidNoteInPdf;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCustomPaymentMethod() {
        return customPaymentMethod;
    }

    public void setCustomPaymentMethod(String customPaymentMethod) {
        this.customPaymentMethod = customPaymentMethod;
    }

    public Boolean getHideBankAccount() {
        return hideBankAccount;
    }

    public void setHideBankAccount(Boolean hideBankAccount) {
        this.hideBankAccount = hideBankAccount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getTransferredTaxLiability() {
        return transferredTaxLiability;
    }

    public void setTransferredTaxLiability(Boolean transferredTaxLiability) {
        this.transferredTaxLiability = transferredTaxLiability;
    }

    public String getSupplyCode() {
        return supplyCode;
    }

    public void setSupplyCode(String supplyCode) {
        this.supplyCode = supplyCode;
    }

    public String getOss() {
        return oss;
    }

    public void setOss(String oss) {
        this.oss = oss;
    }

    public String getVatPriceMode() {
        return vatPriceMode;
    }

    public void setVatPriceMode(String vatPriceMode) {
        this.vatPriceMode = vatPriceMode;
    }

    public String[] getAttachments() {
        return attachments;
    }

    public void setAttachments(String[] attachments) {
        this.attachments = attachments;
    }

    public enum PaymentMethod {
        @JsonProperty("bank")
        BANK,
        @JsonProperty("cash")
        CASH,
        @JsonProperty("cod")
        COD,
        @JsonProperty("card")
        CARD,
        @JsonProperty("paypal")
        PAYPAL,
        @JsonProperty("custom")
        CUSTOM
    }

    public enum ProformaFollowupDocument {
        @JsonProperty("final_invoice_paid")
        FINAL_INVOICE_PAID,
        @JsonProperty("final_invoice")
        FINAL_INVOICE,
        @JsonProperty("tax_document")
        TAX_DOCUMENT,
        @JsonProperty("none")
        NONE
    }

    public enum DocumentType {
        @JsonProperty("partial_proforma")
        PARTIAL_PROFORMA,
        @JsonProperty("proforma")
        PROFORMA,
        @JsonProperty("correction")
        CORRECTION,
        @JsonProperty("tax_document")
        TAX_DOCUMENT,
        @JsonProperty("final_invoice")
        FINAL_INVOICE,
        @JsonProperty("invoice")
        INVOICE
    }

    public static class BasePayment {
        @JsonProperty("paid_on")
        private LocalDate paidOn;
        @JsonProperty("amount")
        private Double amount;
        @JsonProperty("native_amount")
        private Double nativeAmount;
        @JsonProperty("mark_document_as_paid")
        private Boolean markDocumentAsPaid;
        @JsonProperty("proforma_followup_document")
        private String proformaFollowupDocument;
        @JsonProperty("send_thank_you_email")
        private Boolean sendThankYouEmail;
        @JsonProperty("variable_symbol")
        private String variableSymbol;
        @JsonProperty("bank_account_id")
        private Integer bankAccountId;

        public LocalDate getPaidOn() {
            return paidOn;
        }

        public void setPaidOn(LocalDate paidOn) {
            this.paidOn = paidOn;
        }

        public Double getAmount() {
            return amount;
        }

        public void setAmount(Double amount) {
            this.amount = amount;
        }

        public Double getNativeAmount() {
            return nativeAmount;
        }

        public void setNativeAmount(Double nativeAmount) {
            this.nativeAmount = nativeAmount;
        }

        public Boolean getMarkDocumentAsPaid() {
            return markDocumentAsPaid;
        }

        public void setMarkDocumentAsPaid(Boolean markDocumentAsPaid) {
            this.markDocumentAsPaid = markDocumentAsPaid;
        }

        public String getProformaFollowupDocument() {
            return proformaFollowupDocument;
        }

        public void setProformaFollowupDocument(String proformaFollowupDocument) {
            this.proformaFollowupDocument = proformaFollowupDocument;
        }

        public Boolean getSendThankYouEmail() {
            return sendThankYouEmail;
        }

        public void setSendThankYouEmail(Boolean sendThankYouEmail) {
            this.sendThankYouEmail = sendThankYouEmail;
        }

        public String getVariableSymbol() {
            return variableSymbol;
        }

        public void setVariableSymbol(String variableSymbol) {
            this.variableSymbol = variableSymbol;
        }

        public Integer getBankAccountId() {
            return bankAccountId;
        }

        public void setBankAccountId(Integer bankAccountId) {
            this.bankAccountId = bankAccountId;
        }
    }

    public static class BaseInvoiceLine {
        @JsonProperty("name")
        private String name;
        @JsonProperty("quantity")
        private Double quantity;
        @JsonProperty("unit_name")
        private String unitName;
        @JsonProperty("unit_price")
        private Double unitPrice;
        @JsonProperty("vat_rate")
        private Integer vatRate;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getQuantity() {
            return quantity;
        }

        public void setQuantity(Double quantity) {
            this.quantity = quantity;
        }

        public String getUnitName() {
            return unitName;
        }

        public void setUnitName(String unitName) {
            this.unitName = unitName;
        }

        public Double getUnitPrice() {
            return unitPrice;
        }

        public void setUnitPrice(Double unitPrice) {
            this.unitPrice = unitPrice;
        }

        public Integer getVatRate() {
            return vatRate;
        }

        public void setVatRate(Integer vatRate) {
            this.vatRate = vatRate;
        }
    }
}
