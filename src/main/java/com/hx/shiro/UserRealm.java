package com.hx.shiro;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class UserRealm extends AuthorizingRealm {

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName = (String) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		if(userName.equals("admin")){
			Set<String> roles = new HashSet<String>();
			roles.add("admin");
			authorizationInfo.setRoles(roles);
			Set<String> permissions = new HashSet<String>();
			permissions.add("admin:*");
			authorizationInfo.setStringPermissions(permissions);
		}
		return authorizationInfo;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;
		String userCode = usernamePasswordToken.getUsername();
		String password = new String(usernamePasswordToken.getPassword());
		if (userCode.equals("admin") && password.equals("admin")) {
			return new SimpleAuthenticationInfo(userCode, password, getName());
		}
		return null;
	}

}
