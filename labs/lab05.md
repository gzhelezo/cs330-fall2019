---
layout: default
course_number: CS330
title: "Programming Lab 4 - Encrypted Chat Server/Client"
---

# Programming Lab 4 - Encrypted Chat Server/Client   

#### Intend 

The intend of this exercise is to demonstrate symmetric encryption techniques. We will be using the simple client and server applications from Programming Lab 3, to pass back and forth single line encrypted text messages. In this lab, we will be leveraging Advanced Encryption Standard cipher.

#### Tasks 
- Specifically, you will update the simple client and the server to use a single key to encrypt and decrypt a message.
- Capture the chat communication in Wireshark and submit the trace.

#### Encrypt 

```java
public static String encrypt(String plainText, SecretKey secretKey) throws BadPaddingException, NoSuchPaddingException {
        try {
            // Cipher object that implements Advanced Encryption Standard
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            
            byte[] plainTextBytes = plainText.getBytes();            

            byte[] encryptedBytes = cipher.doFinal(plainTextBytes);
            Base64.Encoder encoder = Base64.getEncoder();
            String encryptedText = encoder.encodeToString(encryptedBytes);
            return encryptedText;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException
                | InvalidKeyException | IllegalBlockSizeException
                | BadPaddingException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }
```

#### Decrypt 

```java
public static String decrypt(String encryptedText, SecretKey secretKey) throws InvalidKeyException {
        try {

            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKey);

            Base64.Decoder decoder = Base64.getDecoder();
            byte[] encryptedBytes = decoder.decode(encryptedText);

            // Decrypt
            byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
            String decryptedText = new String(decryptedBytes);
            return decryptedText;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException
                | InvalidKeyException | IllegalBlockSizeException
                | BadPaddingException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }
```

#### Secret Key
- Both _encrypt_ and _decrypt_ methods need a _SecretKey_. 
- The secret key is generated and can be found here - [symmetrickey.jks](symmetrickey.jks).
- The following snippet will extract it from your project folder. 

```java
    private static SecretKey getSecretKey() throws UnrecoverableEntryException {
        SecretKey secretKey = null;
        try {
            // symmetric key
            File file = new File("symmetrickey.jks");

            // JCEKS stands for Java Cryptography Extension KeyStore
            final KeyStore keyStore = KeyStore.getInstance("JCEKS");

            // Loads this KeyStore from the given input stream.
            // a password is given to unlock the keystore
            keyStore.load(new FileInputStream(file),
                    "keystorepassword".toCharArray());

            // Creates a password parameter
            KeyStore.PasswordProtection keyPassword
                    = new KeyStore.PasswordProtection("password".toCharArray());

            // Gets a keystore Entry for the specified alias with the specified protection parameter
            KeyStore.Entry entry = keyStore.getEntry("alias", keyPassword);

            // Gets the SecretKey from this entry.
            secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
        } catch (KeyStoreException | IOException
                | NoSuchAlgorithmException | CertificateException ex) {
            ex.printStackTrace();
        } catch (UnrecoverableEntryException ex) {
            ex.printStackTrace();
        }
        return secretKey;
    }
```

#### Grading

Post your report including source in [Marmoset](https://cs.ycp.edu/marmoset) by the scheduled due date in the syllabus.
