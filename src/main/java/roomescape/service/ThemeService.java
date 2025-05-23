package roomescape.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import roomescape.domain.Theme;
import roomescape.repository.ThemeRepository;

@Service
public class ThemeService {
    private final ThemeRepository themeRepository;

    @Autowired
    public ThemeService(ThemeRepository themeRepository) {
        this.themeRepository = themeRepository;
    }

    public Theme save(Theme theme) {
        return themeRepository.save(theme);
    }

    public List<Theme> read() {
        return themeRepository.read();
    }

    public void delete(Long id) {
        themeRepository.delete(id);
    }

    public List<Theme> readLists(String orderType, Long listNum) {
        if (orderType.equals("popular_desc")) {
            return themeRepository.readByDesc(listNum);
        }

        return themeRepository.readByAsc(listNum);
    }
}
