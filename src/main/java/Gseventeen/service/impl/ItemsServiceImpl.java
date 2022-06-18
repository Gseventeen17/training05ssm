package Gseventeen.service.impl;

import Gseventeen.mapper.ItemsMapper;
import Gseventeen.pojo.Items;
import Gseventeen.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;
    @Override
    public List<Items> findAll() {
        List<Items> all = itemsMapper.findAll();
        return all;
    }
}
