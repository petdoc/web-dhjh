package edu.java.persistence;

import java.util.ArrayList;

import edu.java.title.TitleVO;

public interface TitleDAO {

		public abstract ArrayList<TitleVO> select();
		public abstract int insert(TitleVO vo);
		public abstract int delete(String userid );
		public abstract int update(TitleVO vo);
}
