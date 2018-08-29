package pkr.social.app.weConnect.Model.PersistantImpl;

<<<<<<< HEAD
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pkr.social.app.weConnect.Entitlies.wc_UserEntity;
=======


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

>>>>>>> 3990d31f00f0bfe655b3cc3dd6b53addf212202a
import pkr.social.app.weConnect.Model.IPersistant.IValidateAadharUserPersistance;

@Repository
public class ValidateAadhaarUserPersistant implements IValidateAadharUserPersistance {

<<<<<<< HEAD
	private static final Logger logger = Logger.getLogger(ValidateAadhaarUserPersistant.class);

=======
>>>>>>> 3990d31f00f0bfe655b3cc3dd6b53addf212202a
	@Autowired
	private SessionFactory _sessionFactory;

	@Override
<<<<<<< HEAD
	public Long _validateAadhaarUserFromDataStore(String _uid) {
		Long aadhaarCount = 0l;
		try {
			Session session = _sessionFactory.openSession();
			Criteria _criteriaForAadharValidation = session.createCriteria(wc_UserEntity.class);
			_criteriaForAadharValidation.add(Restrictions.eq("uid", _uid));
			_criteriaForAadharValidation.setProjection(Projections.rowCount());
			aadhaarCount = (Long) _criteriaForAadharValidation.uniqueResult();

		} catch (Exception e) {
			logger.error("[ INFO ]:[ ERROR WHILE VALIDATING FOR DUPLICATE AADHAAR CARD ] " + e.getMessage());
		}
		return aadhaarCount;
=======
	public boolean _validateAadhaarUserFromDataStore(String _uid) {

		Session session=_sessionFactory.openSession();
		Transaction transaction=null;
		transaction=session.beginTransaction();
		/*session.get*/
		
		return false;
>>>>>>> 3990d31f00f0bfe655b3cc3dd6b53addf212202a
	}

}
