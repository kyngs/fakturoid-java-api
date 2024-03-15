package xyz.kyngs.fakturoid.api.v3.model.invoice;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateInvoice extends BaseInvoice<CreateInvoice.CreateInvoiceLine> {
    public static class CreateInvoiceLine extends BaseInvoice.BaseInvoiceLine {
        @JsonProperty("inventory_item_id")
        private Integer inventoryItemId;
        @JsonProperty("sku")
        private String sku;
        @JsonProperty("unit_name")
        private String unitName;

        public void setInventoryItemId(Integer inventoryItemId) {
            this.inventoryItemId = inventoryItemId;
        }

        public void setSKU(String sku) {
            this.sku = sku;
        }
    }
}
