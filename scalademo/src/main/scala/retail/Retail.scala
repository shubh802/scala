package retail

class OrderItem
(
  var orderItemId: Int,
  var orderItemOrderId: Int,
  var orderItemProductId: Int,
  var orderItemQuantity: Int,
  var orderItemSubtotal: Float,
  var orderItemProductPrice: Float
){
  require(orderItemSubtotal == orderItemQuantity * orderItemProductPrice,
    "Invalid order subtotal")
  def this(orderItemId: Int,
    orderItemOrderId: Int,
    orderItemProductId: Int,
    orderItemQuantity: Int,
    orderItemProductPrice: Float
    ) = {
      this(orderItemId, orderItemOrderId, orderItemProductId, orderItemQuantity, orderItemQuantity * orderItemProductPrice,
        orderItemProductPrice)
  }
  override def toString: String = "OrderItem("+
  orderItemId+ ","+
  orderItemOrderId+ ","+
  orderItemProductId+ ","+
  orderItemQuantity+ ","+
  orderItemSubtotal+ ","+
  orderItemProductPrice +")"
}