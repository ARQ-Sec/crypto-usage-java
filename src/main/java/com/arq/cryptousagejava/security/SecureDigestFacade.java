package com.arq.cryptousagejava.security;
import java.security.MessageDigest;
public class SecureDigestFacade { public byte[] digest(byte[] value) throws Exception { return MessageDigest.getInstance("SHA-256").digest(value); } }
