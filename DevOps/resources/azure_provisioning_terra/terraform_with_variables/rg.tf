resource "azurerm_resource_group" "rg" {
  name     = var.resoure_group_name
  location = "West Europe"

  tags {
    environment = "Terraform Azure"
  }
}
