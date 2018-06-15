package egovframework.com.uat.sso.service;

import java.io.IOException;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import egovframework.com.cmm.LoginVO;

public class EgovSSOServiceImpl implements EgovSSOService{

	@Override
	public boolean hasTokenInSSOServer(ServletRequest request, ServletResponse response) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void requestIssueToken(ServletRequest request, ServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ssoLoginByServer(ServletRequest request, ServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public LoginVO getLoginVO(ServletRequest request, ServletResponse response) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void ssoLogout(ServletRequest request, ServletResponse response, String returnURL) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	

}
