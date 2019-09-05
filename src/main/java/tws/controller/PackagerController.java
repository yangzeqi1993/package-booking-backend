package tws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tws.entity.Packager;
import tws.repository.PackagerMapper;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/packagers")
public class PackagerController {
    @Autowired
    private PackagerMapper packagerMapper;

    @GetMapping("")
    public ResponseEntity<List<Packager>> getAll() {
        return ResponseEntity.ok(packagerMapper.selectAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Packager> getOne(@PathVariable String id) {
        return ResponseEntity.ok(packagerMapper.selectOne(id));
    }

    @PostMapping("")
    public ResponseEntity<Packager> insertPackager(@RequestBody Packager packager) {
        packagerMapper.insert(packager);
        return ResponseEntity.created(URI.create("/packagers/" + packager.getId())).body(packager);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Packager> updatePackager(@PathVariable String id, @RequestBody Packager packager) {
        packagerMapper.update(id,packager);
        return ResponseEntity.ok(packager);
    }
}
