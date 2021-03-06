## Search Invoices Response

Describes a `SearchInvoices` response.

### Structure

`SearchInvoicesResponse`

### Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Invoices` | [`List<Invoice>`](/doc/models/invoice.md) | Optional | The list of invoices returned by the search. | List<Invoice> getInvoices() |
| `Cursor` | `String` | Optional | When a response is truncated, it includes a cursor that you can use in a <br>subsequent request to fetch the next set of invoices. If empty, this is the final <br>response. <br>For more information, see [Pagination](https://developer.squareup.com/docs/docs/working-with-apis/pagination). | String getCursor() |
| `Errors` | [`List<Error>`](/doc/models/error.md) | Optional | Information about errors encountered during the request. | List<Error> getErrors() |

### Example (as JSON)

```json
{
  "invoices": [
    {
      "invoice": {
        "id": "gt2zv1z6mnUm1V7KMxxf3w",
        "version": 0,
        "location_id": "ES0RJRZYEC39A",
        "order_id": "CAISENgvlJ6jLWAzERDzjyHVybY",
        "payment_requests": [
          {
            "uid": "2da7964f-f3d2-4f43-81e8-5aa220bf3355",
            "request_method": "EMAIL",
            "request_type": "BALANCE",
            "due_date": "2030-01-24",
            "tipping_enabled": true,
            "reminders": [
              {
                "uid": "beebd363-e47f-4075-8785-c235aaa7df11",
                "relative_scheduled_days": -1,
                "message": "Your invoice is due tomorrow",
                "status": "PENDING"
              }
            ],
            "computed_amount_money": {
              "amount": 10000,
              "currency": "USD"
            },
            "total_completed_amount_money": {
              "amount": 0,
              "currency": "USD"
            }
          }
        ],
        "invoice_number": "inv-100",
        "title": "Event Planning Services",
        "description": "We appreciate your business!",
        "scheduled_at": "2030-01-13T10:00:00Z",
        "status": "DRAFT",
        "timezone": "America/Los_Angeles",
        "created_at": "2020-06-18T17:45:13Z",
        "updated_at": "2020-06-18T17:45:13Z",
        "primary_recipient": {
          "customer_id": "JDKYHBWT1D4F8MFH63DBMEN8Y4",
          "given_name": "Amelia",
          "family_name": "Earhart",
          "email_address": "Amelia.Earhart@example.com",
          "phone_number": "1-212-555-4240"
        }
      }
    }
  ],
  "cursor": "CURSOR"
}
```

