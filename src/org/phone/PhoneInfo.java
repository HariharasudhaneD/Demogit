package org.phone;

public class PhoneInfo {
private void phoneName() {
	System.out.println("phonename is Oneplus 10r");
}
private void phoneMieiNum() {
	System.out.println("phoneMieiNum is 12345678");
}
private void Camera() {
	System.out.println("Camera is Available ");
}
private void storage() {
	System.out.println("Storage is 256gb");
} 	
private void osName() {
	System.out.println("osName is Android 12 ");
} 

public static void main(String[]args) {

	PhoneInfo m= new PhoneInfo();
	
	m.phoneName();
	m.phoneMieiNum();
	m.Camera();
	m.storage();
	m.osName();
		
}

}
