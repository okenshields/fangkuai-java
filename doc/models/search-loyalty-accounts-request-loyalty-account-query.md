## Search Loyalty Accounts Request Loyalty Account Query

The search criteria for the loyalty accounts.

### Structure

`SearchLoyaltyAccountsRequestLoyaltyAccountQuery`

### Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Mappings` | [`List<LoyaltyAccountMapping>`](/doc/models/loyalty-account-mapping.md) | Optional | The set of mappings to use in the loyalty account search. | List<LoyaltyAccountMapping> getMappings() |

### Example (as JSON)

```json
{
  "mappings": [
    {
      "id": "id4",
      "type": "type6",
      "value": "value6",
      "created_at": "created_at8"
    }
  ]
}
```

