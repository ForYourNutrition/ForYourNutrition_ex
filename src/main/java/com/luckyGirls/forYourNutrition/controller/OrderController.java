package com.luckyGirls.forYourNutrition.controller;
//
// import java.util.ArrayList;
// import java.util.List;
//
// import jakarta.servlet.http.HttpServletRequest;
//
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.validation.BindingResult;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.SessionAttributes;
// import org.springframework.web.bind.support.SessionStatus;
// import org.springframework.web.servlet.ModelAndView;
// import org.springframework.web.servlet.ModelAndViewDefiningException;
//
// import com.luckyGirls.forYourNutrition.domain.Cart;
// import com.luckyGirls.forYourNutrition.domain.Member;
// import com.luckyGirls.forYourNutrition.domain.Order;
// @Controller
// public class OrderController {
// 	@Autowired
// 	private Member member;
// //	@Autowired
// //	private OrderValidator orderValidator;
//
// 	@ModelAttribute("orderForm")
// 	public OrderForm createOrderForm() {
// 		return new OrderForm();
// 	}
//
// 	@ModelAttribute("creditCardTypes")
// 	public List<String> referenceData() {
// 		ArrayList<String> creditCardTypes = new ArrayList<String>();
// 		creditCardTypes.add("Visa");
// 		creditCardTypes.add("MasterCard");
// 		creditCardTypes.add("American Express");
// 		return creditCardTypes;
// 	}
//
// 	//구현이 덜되어서 빨간줄 표시 나는 부분 주석처리
// 	//order->orderForm 으로 넘어가는 것
// 	@RequestMapping("/newOrder.do")
// 	public String initNewOrder(HttpServletRequest request,
// 			@ModelAttribute("sessionCart") Cart cart,
// 			@ModelAttribute("orderForm") OrderForm orderForm
// 			) throws ModelAndViewDefiningException {
// 		//UserSession userSession = (UserSession) request.getSession().getAttribute("userSession");
// 		if (cart != null) {
// 			// Re-read account from DB at team's request.
// 			//Member member = member.getAccount(userSession.getAccount().getUserId());
// 			//orderForm.getOrder().initOrder(member, cart);
// 			return "NewOrderForm";
// 		}
// 		else {
// 			ModelAndView modelAndView = new ModelAndView("Error");
// 			modelAndView.addObject("message", "An order could not be created because a cart could not be found.");
// 			throw new ModelAndViewDefiningException(modelAndView);
// 		}
// 	}
//
// 	//order 버튼클릭
// 	@RequestMapping("/order.do")
// 	public String bindAndValidateOrder(HttpServletRequest request,
// 			@ModelAttribute("orderForm") OrderForm orderForm,
// 			BindingResult result) {
// 		if (orderForm.didShippingAddressProvided() == false) {
// 			// from NewOrderForm
// 		//	orderValidator.validateCreditCard(orderForm.getOrder(), result);
// 		//	orderValidator.validateBillingAddress(orderForm.getOrder(), result);
// 			if (result.hasErrors()) return "NewOrderForm";
//
// 			if (orderForm.isShippingAddressRequired() == true) {
// 				orderForm.setShippingAddressProvided(true);
// 				return "ShippingForm";
// 			}
// 			else {
// 				return "ConfirmOrder";
// 			}
// 		}
// 		else {		// from ShippingForm
// 	//		orderValidator.validateShippingAddress(orderForm.getOrder(), result);
// 			if (result.hasErrors()) return "ShippingForm";
// 			return "ConfirmOrder";
// 		}
// 	}
// 	//주문 확인
// /*
// 	@RequestMapping("/confirmOrder.do")
// 	protected ModelAndView confirmOrder(
// 			@ModelAttribute("orderForm") OrderForm orderForm,
// 			SessionStatus status) {
// //		member.insertOrder(orderForm.getOrder());
// 		ModelAndView mav = new ModelAndView("ViewOrder");
// 		mav.addObject("order", orderForm.getOrder());
// 		mav.addObject("message", "Thank you, your order has been submitted.");
// 		status.setComplete();  // remove sessionCart and orderForm from session
// 		return mav;
// 	}
// */
// //주문 취소
// 	/*
// 	@RequestMapping("deleteOrder.do")
// 	protected ModelAndView deleteOrder(
// 			@ModelAttribute("order") Order order,
// 			SessionStatus status) {
// 		member.deleteOrder(order.getOrderId());
// 		ModelAndView mav = new ModelAndView("ViewOrder");
// 		mav.addObject("order", orderForm.getOrder());
// 		mav.addObject("message", "Thank you, your order has been submitted.");
// 		status.setComplete();  // remove sessionCart and orderForm from session
// 		return mav;
// 	}
// 	*/
//
//
// }
