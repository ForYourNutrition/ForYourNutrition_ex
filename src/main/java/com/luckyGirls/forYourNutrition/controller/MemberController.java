package com.luckyGirls.forYourNutrition.controller;

import com.luckyGirls.forYourNutrition.service.MemberService;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.WebUtils;

@Controller
@SessionAttributes("memberSession")
public class MemberController {
	@Autowired
	private MemberService memberService;

	@Value("ModifyAccountForm")
	private String formViewName;

	//회원가입 시, 존재하는 session = return account, 존재하지 않으면 새로운 account form return
	@Autowired
	private AccountFormValidator validator;
	public void setValidator(AccountFormValidator validator) {
		this.validator = validator;
	}

	@ModelAttribute("member")
	public AccountForm formBackingObject(HttpServletRequest request) 
			throws Exception {
		UserSession userSession = 
				(UserSession) WebUtils.getSessionAttribute(request, "userSession");
		if (userSession != null) {	// edit an existing account
			return new AccountForm(
					memberService.getMember(userSession.getMember().getMembername()));
		}
		else {	// create a new account
			return new AccountForm();
		}
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
	public ModelAndView viewLoginForm(HttpServletRequest request) throws Exception {
		//추후 구현
	}

	@RequestMapping(value = "/searchId.do", method = RequestMethod.GET)
	public ModelAndView viewSerchIdForm(HttpServletRequest request) throws Exception {
		//추후 구현
	}

	@RequestMapping(value = "/searchId.do", method = RequestMethod.POST)
	public ModelAndView searchId(HttpServletRequest request,
			@RequestParam("name") String name,
			@RequestParam("email") String email) throws Exception {
		//추후 구현
	}

	@RequestMapping(value = "/searchPwd.do", method = RequestMethod.GET)
	public ModelAndView viewSearchPwdForm(HttpServletRequest request) throws Exception {
		//추후 구현
	}

	@RequestMapping(value = "/searchPwd.do", method = RequestMethod.POST)
	public ModelAndView searchPwd(HttpServletRequest request,
			@RequestParam("id") String id,
			@RequestParam("email") String email) throws Exception {
		//추후 구현
	}

	@RequestMapping(value = "/login.do", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, 
			@RequestParam("id") String id,
			@RequestParam("password") String password,
			@RequestParam(value="forwardAction", required=false) String forwardAction,
			Model model) throws Exception {
		Member member =  memberService.getMember(id);

		if (member == null) {
			return new ModelAndView("Error", "message", 
					"Invalid username or password.  Signon failed.");
		}
		else {
			//추후 구현
		}
	}

	@RequestMapping("/logout.do")
	public ModelAndView logout(HttpServletRequest request) throws Exception {
		session.removeAttribute("userSession");
		session.invalidate();
		return "index";
	}

	@RequestMapping(value ="/createAccount.do" , method = RequestMethod.GET)
	public String viewAccountForm(HttpServletRequest request) throws Exception {
		//추후 구현
		return formViewName;
	}

	@RequestMapping(value ="/createAccount.do" , method = RequestMethod.POST)
	public ModelAndView createAccount(HttpServletRequest request, HttpSession session,
			@ModelAttribute("accountForm") AccountForm accountForm,
			BindingResult result) throws Exception {
		validator.validate(accountForm, result);

		if (result.hasErrors()) return formViewName;
		try {
			if (accountForm.isNewAccount()) {
				memberService.insertMember(accountForm.getAccount());
			}
			else {
				memberService.updateMember(accountForm.getAccount());
			}
		}
		catch (DataIntegrityViolationException ex) {
			result.rejectValue("account.membername", "USER_ID_ALREADY_EXISTS",
					"Member ID already exists: choose a different ID.");
			return formViewName; 
		}

		//추후 구현
		return successViewName;  
	}


	@RequestMapping(value ="/modifyAccount.do" , method = RequestMethod.GET)
	public String viewModifyAccountForm(HttpServletRequest request) throws Exception {
		//추후 구현
		return formViewName;
	}


	@RequestMapping(value ="/modifyAccount.do" , method = RequestMethod.POST)
	public ModelAndView modifyAccount(HttpServletRequest request, HttpSession session,
			@ModelAttribute("accountForm") AccountForm accountForm,
			BindingResult result) throws Exception {
		validator.validate(accountForm, result);

		if (result.hasErrors()) return formViewName;
		try {
			if (accountForm.isNewAccount()) {
				memberService.insertMember(accountForm.getAccount());
			}
			else {
				memberService.updateMember(accountForm.getAccount());
			}
		}
		catch (DataIntegrityViolationException ex) {
			result.rejectValue("account.membername", "USER_ID_ALREADY_EXISTS",
					"Member ID already exists: choose a different ID.");
			return formViewName; 
		}

		//추후 구현
		return successViewName;  
	}


	@RequestMapping("/deleteAccount.do")
	public ModelAndView deleteAccunt(HttpServletRequest request) throws Exception {
		//추후 구현
	}
}
