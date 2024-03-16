package xyz.kyngs.fakturoid.api.v3.model.subject;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseSubject {
    @JsonProperty("custom_id")
    private String customId;
    @JsonProperty("type")
    private SubjectType type;

    @JsonProperty("name")
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("email")
    private String email;
    @JsonProperty("email_copy")
    private String emailCopy;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("web")
    private String web;

    @JsonProperty("street")
    private String street;
    @JsonProperty("city")
    private String city;
    @JsonProperty("zip")
    private String zip;
    @JsonProperty("country")
    private String country;
    @JsonProperty("has_delivery_address")
    private Boolean hasDeliveryAddress;
    @JsonProperty("delivery_name")
    private String deliveryName;
    @JsonProperty("delivery_street")
    private String deliveryStreet;
    @JsonProperty("delivery_city")
    private String deliveryCity;
    @JsonProperty("delivery_zip")
    private String deliveryZip;
    @JsonProperty("delivery_country")
    private String deliveryCountry;
    @JsonProperty("due")
    private Integer due;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("language")
    private String language;
    @JsonProperty("private_note")
    private String privateNote;
    @JsonProperty("registration_no")
    private String registrationNo;
    @JsonProperty("vat_no")
    private String vatNo;
    @JsonProperty("local_vat_no")
    private String localVatNo;
    @JsonProperty("legal_form")
    private String legalForm;
    @JsonProperty("vat_mode")
    private String vatMode;
    @JsonProperty("bank_account")
    private String bankAccount;
    @JsonProperty("iban")
    private String iban;
    @JsonProperty("swift_bic")
    private String swiftBic;
    @JsonProperty("variable_symbol")
    private String variableSymbol;
    @JsonProperty("enabled_reminders")
    private Boolean enabledReminders;
    @JsonProperty("enabled_pdf_attachments")
    private Boolean enabledPdfAttachments;
    @JsonProperty("enabled_estimate_pdf_attachments")
    private Boolean enabledEstimatePdfAttachments;
    @JsonProperty("ares_update")
    private Boolean aresUpdate;
    @JsonProperty("suggestion_enabled")
    private Boolean suggestionEnabled;
    @JsonProperty("custom_email_text")
    private String customEmailText;
    @JsonProperty("overdue_email_text")
    private String overdueEmailText;
    @JsonProperty("invoice_from_proforma_email_text")
    private String invoiceFromProformaEmailText;
    @JsonProperty("thank_you_email_text")
    private String thankYouEmailText;
    @JsonProperty("custom_estimate_email_text")
    private String customEstimateEmailText;
    @JsonProperty("webinvoice_history")
    private WebInvoiceHistory webInvoiceHistory;

    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    public SubjectType getType() {
        return type;
    }

    public void setType(SubjectType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailCopy() {
        return emailCopy;
    }

    public void setEmailCopy(String emailCopy) {
        this.emailCopy = emailCopy;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Boolean getHasDeliveryAddress() {
        return hasDeliveryAddress;
    }

    public void setHasDeliveryAddress(Boolean hasDeliveryAddress) {
        this.hasDeliveryAddress = hasDeliveryAddress;
    }

    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getDeliveryStreet() {
        return deliveryStreet;
    }

    public void setDeliveryStreet(String deliveryStreet) {
        this.deliveryStreet = deliveryStreet;
    }

    public String getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(String deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getDeliveryZip() {
        return deliveryZip;
    }

    public void setDeliveryZip(String deliveryZip) {
        this.deliveryZip = deliveryZip;
    }

    public String getDeliveryCountry() {
        return deliveryCountry;
    }

    public void setDeliveryCountry(String deliveryCountry) {
        this.deliveryCountry = deliveryCountry;
    }

    public Integer getDue() {
        return due;
    }

    public void setDue(Integer due) {
        this.due = due;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPrivateNote() {
        return privateNote;
    }

    public void setPrivateNote(String privateNote) {
        this.privateNote = privateNote;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getVatNo() {
        return vatNo;
    }

    public void setVatNo(String vatNo) {
        this.vatNo = vatNo;
    }

    public String getLocalVatNo() {
        return localVatNo;
    }

    public void setLocalVatNo(String localVatNo) {
        this.localVatNo = localVatNo;
    }

    public String getLegalForm() {
        return legalForm;
    }

    public void setLegalForm(String legalForm) {
        this.legalForm = legalForm;
    }

    public String getVatMode() {
        return vatMode;
    }

    public void setVatMode(String vatMode) {
        this.vatMode = vatMode;
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

    public String getVariableSymbol() {
        return variableSymbol;
    }

    public void setVariableSymbol(String variableSymbol) {
        this.variableSymbol = variableSymbol;
    }

    public Boolean getEnabledReminders() {
        return enabledReminders;
    }

    public void setEnabledReminders(Boolean enabledReminders) {
        this.enabledReminders = enabledReminders;
    }

    public Boolean getEnabledPdfAttachments() {
        return enabledPdfAttachments;
    }

    public void setEnabledPdfAttachments(Boolean enabledPdfAttachments) {
        this.enabledPdfAttachments = enabledPdfAttachments;
    }

    public Boolean getEnabledEstimatePdfAttachments() {
        return enabledEstimatePdfAttachments;
    }

    public void setEnabledEstimatePdfAttachments(Boolean enabledEstimatePdfAttachments) {
        this.enabledEstimatePdfAttachments = enabledEstimatePdfAttachments;
    }

    public Boolean getAresUpdate() {
        return aresUpdate;
    }

    public void setAresUpdate(Boolean aresUpdate) {
        this.aresUpdate = aresUpdate;
    }

    public Boolean getSuggestionEnabled() {
        return suggestionEnabled;
    }

    public void setSuggestionEnabled(Boolean suggestionEnabled) {
        this.suggestionEnabled = suggestionEnabled;
    }

    public String getCustomEmailText() {
        return customEmailText;
    }

    public void setCustomEmailText(String customEmailText) {
        this.customEmailText = customEmailText;
    }

    public String getOverdueEmailText() {
        return overdueEmailText;
    }

    public void setOverdueEmailText(String overdueEmailText) {
        this.overdueEmailText = overdueEmailText;
    }

    public String getInvoiceFromProformaEmailText() {
        return invoiceFromProformaEmailText;
    }

    public void setInvoiceFromProformaEmailText(String invoiceFromProformaEmailText) {
        this.invoiceFromProformaEmailText = invoiceFromProformaEmailText;
    }

    public String getThankYouEmailText() {
        return thankYouEmailText;
    }

    public void setThankYouEmailText(String thankYouEmailText) {
        this.thankYouEmailText = thankYouEmailText;
    }

    public String getCustomEstimateEmailText() {
        return customEstimateEmailText;
    }

    public void setCustomEstimateEmailText(String customEstimateEmailText) {
        this.customEstimateEmailText = customEstimateEmailText;
    }

    public WebInvoiceHistory getWebInvoiceHistory() {
        return webInvoiceHistory;
    }

    public void setWebInvoiceHistory(WebInvoiceHistory webInvoiceHistory) {
        this.webInvoiceHistory = webInvoiceHistory;
    }

    public enum WebInvoiceHistory {
        @JsonProperty("disabled")
        DISABLED,
        @JsonProperty("recent")
        RECENT,
        @JsonProperty("client_portal")
        CLIENT_PORTAL
    }

    public enum SubjectType {
        @JsonProperty("customer")
        CUSTOMER,
        @JsonProperty("supplier")
        SUPPLIER,
        @JsonProperty("both")
        BOTH
    }
}
