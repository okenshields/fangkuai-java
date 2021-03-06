## List Cash Drawer Shift Events Response

### Structure

`ListCashDrawerShiftEventsResponse`

### Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Events` | [`List<CashDrawerShiftEvent>`](/doc/models/cash-drawer-shift-event.md) | Optional | All of the events (payments, refunds, etc.) for a cash drawer during<br>the shift. | List<CashDrawerShiftEvent> getEvents() |
| `Cursor` | `String` | Optional | Opaque cursor for fetching the next page. Cursor is not present in<br>the last page of results. | String getCursor() |
| `Errors` | [`List<Error>`](/doc/models/error.md) | Optional | Any errors that occurred during the request. | List<Error> getErrors() |

### Example (as JSON)

```json
{
  "events": [
    {
      "id": "id0",
      "employee_id": "employee_id0",
      "event_type": "PAID_OUT",
      "event_money": {
        "amount": 126,
        "currency": "PGK"
      },
      "created_at": "created_at8"
    }
  ],
  "cursor": "cursor6",
  "errors": [
    {
      "category": "AUTHENTICATION_ERROR",
      "code": "REQUEST_TIMEOUT",
      "detail": "detail1",
      "field": "field9"
    },
    {
      "category": "INVALID_REQUEST_ERROR",
      "code": "CONFLICT",
      "detail": "detail2",
      "field": "field0"
    },
    {
      "category": "RATE_LIMIT_ERROR",
      "code": "GONE",
      "detail": "detail3",
      "field": "field1"
    }
  ]
}
```

