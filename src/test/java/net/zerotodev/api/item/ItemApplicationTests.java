package net.zerotodev.api.item;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import lombok.RequiredArgsConstructor;
import net.zerotodev.api.item.domain.Item;
import net.zerotodev.api.item.repository.ItemRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.mockito.Mockito.verify;
import java.util.List;
import static org.mockito.BDDMockito.given;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ItemApplicationTests {

	@Test
	void contextLoads() {
	}

}
