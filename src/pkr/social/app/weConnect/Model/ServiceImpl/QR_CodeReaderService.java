package pkr.social.app.weConnect.Model.ServiceImpl;

<<<<<<< HEAD
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import pkr.social.app.weConnect.Entitlies.wc_UserEntity;
=======
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import javax.imageio.ImageIO;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.springframework.stereotype.Service;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeReader;
>>>>>>> 3990d31f00f0bfe655b3cc3dd6b53addf212202a

@Service
public class QR_CodeReaderService {

<<<<<<< HEAD
	public wc_UserEntity getAadhaarDetails(MultipartFile _aadhaarCard) throws Exception {

		wc_UserEntity wc_UserEntity=null;
		File _aadhaarFile = new File(_aadhaarCard.getOriginalFilename());
		_aadhaarCard.transferTo(_aadhaarFile);

		MultiValueMap<String, Object> bodyMap = new LinkedMultiValueMap<>();
		Resource resource = new FileSystemResource(_aadhaarFile);

		bodyMap.add("AadhaarCard", resource);
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.MULTIPART_FORM_DATA);
		List<MediaType> list = new ArrayList<MediaType>();
		list.add(MediaType.ALL);

		headers.setAccept(list);
		HttpEntity<MultiValueMap<String, Object>> requestEntity = new HttpEntity<>(bodyMap, headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange(
				"http://localhost:8080/we-connect-service/api/v1.0/parseAadhar", HttpMethod.POST, requestEntity,
				String.class);
		if (response.getStatusCode() == HttpStatus.OK) {
			ObjectMapper mapper = new ObjectMapper();
			wc_UserEntity = mapper.readValue(response.getBody(), wc_UserEntity.class);

		}
		return wc_UserEntity;
=======
	

	public  Map<String, String> getAadhaarDetails(String _aadhaarFileName) throws Exception {

		InputStream inputStream = new FileInputStream("F:\\we-conect-data-store\\wc-aadhar-store\\" + _aadhaarFileName);
		BufferedImage qrcodeImage = ImageIO.read(inputStream);
		Map<String, String> _aadharKeyMap = new HashMap<String, String>();
		String _refinedData = readQRCode(qrcodeImage);
		DocumentBuilderFactory _dbf = DocumentBuilderFactory.newInstance();
		_dbf.setValidating(false);
		DocumentBuilder _db = _dbf.newDocumentBuilder();
		Document _doc = _db.parse(new ByteArrayInputStream(_refinedData.getBytes("utf-8")));
		NodeList nlRecords = _doc.getElementsByTagName("PrintLetterBarcodeData");
		int _numOfRecords = nlRecords.getLength();
		for (int i = 0; i < _numOfRecords; i++) {
			Element node = (Element) nlRecords.item(i);
			NamedNodeMap attributes = node.getAttributes();
			int numAttrs = attributes.getLength();
			for (int j = 0; j < numAttrs; j++) {
				Attr attr = (Attr) attributes.item(j);
				_aadharKeyMap.put(attr.getNodeName(), attr.getNodeValue());
			}

		}

		return _aadharKeyMap;
	}

	private static String readQRCode(BufferedImage qrcodeImage) throws Exception {
		Hashtable<DecodeHintType, Object> _hintMap = new Hashtable<DecodeHintType, Object>();
		_hintMap.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
		BufferedImageLuminanceSource _source = new BufferedImageLuminanceSource(qrcodeImage);
		BinaryBitmap _bitmap = new BinaryBitmap(new HybridBinarizer(_source));
		QRCodeReader _reader = new QRCodeReader();
		com.google.zxing.Result _rawResult;
		_rawResult = _reader.decode(_bitmap, _hintMap);
		String _refinedResult = _rawResult.getText()
				.substring(_rawResult.getText().indexOf("PrintLetterBarcodeData") - 1);

		return _refinedResult;
>>>>>>> 3990d31f00f0bfe655b3cc3dd6b53addf212202a
	}

}
