package com.kbstar.frame;

import java.util.List;

import com.kbstar.dto.TransactionDTO;

public interface CRUDService<K, V> {
	public void register(V v) throws Exception; // 사용자가 회원가입을 위해 자기 정보를 입력. 그럼 밸류값을 입력해주자.

	public void delete(K k) throws Exception; // 사용자가 Key값을 넣어주면 그 관련 밸류를 삭제.

	public void modify(V v) throws Exception; // 사용자가 자기 Value를 좀 수정하고 싶대.

	public V get(K k) throws Exception; // Key값을 찾으면, Value값이 리턴되도록 해줘라.

	public List<V> get() throws Exception; // 아무것도 안넣었지만, Value 전부가 리스트로 나오게 해줘라.

}
