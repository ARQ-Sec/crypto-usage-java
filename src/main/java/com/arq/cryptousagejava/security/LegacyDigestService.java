package com.arq.cryptousagejava.security;
import java.security.MessageDigest;
public class LegacyDigestService { public byte[] digest(byte[] value) throws Exception { return MessageDigest.getInstance("MD5").digest(value); } }
