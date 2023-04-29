package com.DocSystem.common;

public enum DocChangeType {
	NOCHANGE,
	LOCALADD,
	LOCALDELETE,
	LOCALCHANGE,
	LOCALFILETODIR,
	LOCALDIRTOFILE,
	REMOTEADD,
	REMOTEDELETE,
	REMOTECHANGE,
	REMOTEFILETODIR,
	REMOTEDIRTOFILE,
	UNDEFINED;
}
