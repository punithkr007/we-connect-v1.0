package pkr.social.app.weConnect.Model.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pkr.social.app.weConnect.Model.IPersistant.IValidateAadharUserPersistance;
import pkr.social.app.weConnect.Model.IService.IValidateAadharUser;

@Service
<<<<<<< HEAD
public class ValidateAadharUserServiceImpl implements IValidateAadharUser {

	@Autowired
	private IValidateAadharUserPersistance validateAadharUserFromdataStore;

	@Override
	public boolean _validateAadhaarUser(String _uid) {

		Long aadhaarCount = validateAadharUserFromdataStore._validateAadhaarUserFromDataStore(_uid);
		if (aadhaarCount <= 0)
			return true;
		else
			return false;
=======
public class ValidateAadharUserServiceImpl implements IValidateAadharUser{

	@Autowired
	private IValidateAadharUserPersistance validateAadharUserFromdataStore;
	
	@Override
	public boolean _validateAadhaarUser(String _uid) {
		validateAadharUserFromdataStore._validateAadhaarUserFromDataStore(_uid);
		return false;
>>>>>>> 3990d31f00f0bfe655b3cc3dd6b53addf212202a
	}

}
