# phonenumber Thymeleaf TagLib

A simple wrapper to use [Google libphonenumber](https://github.com/google/libphonenumber) inside Thymeleaf

[![Maven Central](https://img.shields.io/maven-central/v/ch.itds.taglib/phonenumber-thymeleaf-taglib)](https://search.maven.org/remote_content?g=ch.itds.taglib&a=phonenumber-thymeleaf-taglib&v=LATEST)

## Usage

### Add dependency

```gradle
compile "ch.itds.taglib:phonenumber-thymeleaf-taglib:1.0.1"
```

### Register Dialect

```java
import ch.itds.taglib.phonenumber.PhoneNumberDialect; 

@Bean
public PhoneNumberDialect phoneNumberDialect() {
    return new PhoneNumberDialect();
}
```

### Format number

```html
<a th:href="|tel:${#phoneNumber.format('044 111 22 33', 'CH', 'E164')}|"
   th:text="${#phoneNumber.format('044 111 22 33', 'CH', 'NATIONAL')}"></a>
```
