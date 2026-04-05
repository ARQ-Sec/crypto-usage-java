package com.arq.cryptousagejava.security;
import java.security.MessageDigest;
public class DigestInventoryOnly { public String supported() throws Exception { return MessageDigest.getInstance("SHA-256").getAlgorithm(); } }
